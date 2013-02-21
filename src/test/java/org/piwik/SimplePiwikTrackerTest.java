/**
 * Piwik - Open source web analytics
 * 
 * @license released under BSD License http://www.opensource.org/licenses/bsd-license.php
 * @link http://piwik.org/docs/tracking-api/
 *
 * @category Piwik
 * @package PiwikTracker
 */
package org.piwik;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Martin Fochler
 */
public class SimplePiwikTrackerTest {

	private static final String TEST_VISITORID = "1f3e4069f7a5f882";
	private SimplePiwikTracker instance;
	
	@Before
	public void setUp() throws PiwikException {		
		instance = new SimplePiwikTracker("http://localhost/piwik");
	}

	/**
	 * Test of readRequestInfos method, of class SimplePiwikTracker.
	 */
	@Test
	public void testReadRequestInfos() throws PiwikException, MalformedURLException {
		System.out.println("readRequestInfos");
		HttpServletRequest request = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.readRequestInfos(request);
	}

	/**
	 * Test of setAcceptLanguage method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetAcceptLanguage_String() throws PiwikException, MalformedURLException {
		System.out.println("setAcceptLanguage");
		String language = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setAcceptLanguage(language);
	}

	/**
	 * Test of setAcceptLanguage method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetAcceptLanguage_Locale() throws PiwikException, MalformedURLException {
		System.out.println("setAcceptLanguage");
		Locale locale = Locale.getDefault();
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setAcceptLanguage(locale);
	}

	/**
	 * Test of setApiurl method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetApiurl_String() throws PiwikException, MalformedURLException {
		System.out.println("setApiurl");
		String apiurl = "http://localhost/piwik";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setApiurl(apiurl);
	}

	/**
	 * Test of setApiurl method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetApiurl_URL() throws PiwikException, MalformedURLException {
		System.out.println("setApiurl");
		URL apiurl = new URL("http://localhost/piwik");
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setApiurl(apiurl);
	}

	/**
	 * Test of setCustomData method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetCustomData() throws PiwikException, MalformedURLException {
		System.out.println("setCustomData");
		String customData = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setCustomData(customData);
	}

	/**
	 * Test of setDebug_append_url method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetDebug_append_url() throws PiwikException, MalformedURLException {
		System.out.println("setDebug_append_url");
		String debug_append_url = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setDebugAppendUrl(debug_append_url);
	}

	/**
	 * Test of setForcedDatetime method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetForcedDatetime() throws PiwikException, MalformedURLException {
		System.out.println("setForcedDatetime");
		Date forcedDatetime = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setForcedDatetime(forcedDatetime);
	}

	/**
	 * Test of setIp method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetIp() throws PiwikException, MalformedURLException {
		System.out.println("setIp");
		String ip = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setIp(ip);
	}

	/**
	 * Test of setIdSite method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetIdSite() throws PiwikException, MalformedURLException {
		System.out.println("setIdSite");
		int idSite = 0;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setIdSite(idSite);
	}

	/**
	 * Test of setPageUrl method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetPageUrl() throws PiwikException, MalformedURLException {
		System.out.println("setPageUrl");
		String pageUrl = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setPageUrl(pageUrl);
	}

	/**
	 * Test of setResolution method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetResolution() throws PiwikException, MalformedURLException {
		System.out.println("setResolution");
		int width = 0;
		int height = 0;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setResolution(width, height);
	}

	/**
	 * Test of setRequestCookie method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetRequestCookie() throws PiwikException, MalformedURLException {
		System.out.println("setRequestCookie");
		Cookie requestCookie = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		boolean expResult = false;
		boolean result = instance.setRequestCookie(requestCookie);
		Assert.assertEquals(expResult, result);
	}

	/**
	 * Test of setToken_auth method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetToken_auth() throws PiwikException, MalformedURLException {
		System.out.println("setToken_auth");
		String token_auth = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setTokenAuth(token_auth);
	}

	/**
	 * Test of setUrlReferer method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetUrlReferer_String() throws PiwikException, MalformedURLException {
		System.out.println("setUrlReferer");
		String urlReferer = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setUrlReferer(urlReferer);
	}

	/**
	 * Test of setUrlReferer method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetUrlReferer_URL() throws PiwikException, MalformedURLException {
		System.out.println("setUrlReferer");
		URL urlReferer = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setUrlReferer(urlReferer);
	}

	/**
	 * Test of setUserAgent method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetUserAgent() throws PiwikException, MalformedURLException {
		System.out.println("setUserAgent");
		String userAgent = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setUserAgent(userAgent);
	}

	/**
	 * Test of setVisitorId method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetVisitorId() throws PiwikException, MalformedURLException {
		System.out.println("setVisitorId");
		String visitorId = "";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setVisitorId(visitorId);
	}

	/**
	 * Test of setCustomVariable method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetCustomVariable() throws PiwikException, MalformedURLException {
		System.out.println("setCustomVariable");
		String name = "testvar";
		String value = "testvalue";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		int expResult = 1;
		int result = instance.setPageCustomVariable(name, value);
		Assert.assertEquals(expResult, result);
	}

	/**
	 * Test of clearCustomVariables method, of class SimplePiwikTracker.
	 */
	@Test
	public void testClearCustomVariables() throws PiwikException, MalformedURLException {
		System.out.println("clearCustomVariables");
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.clearCustomVariables();
	}

	/**
	 * Test of setPlugin method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetPlugin() throws PiwikException, MalformedURLException {
		System.out.println("setPlugin");
		BrowserPlugins plugin = BrowserPlugins.FLASH;
		boolean enabled = true;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setPlugin(plugin, enabled);
	}

	/**
	 * Test of clearPluginList method, of class SimplePiwikTracker.
	 */
	@Test
	public void testClearPluginList() throws PiwikException, MalformedURLException {
		System.out.println("clearPluginList");
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.clearPluginList();
	}

	/**
	 * Test of setLocalTime method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetLocalTime_String() throws PiwikException, MalformedURLException {
		System.out.println("setLocalTime");
		String time = "20:12:53";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setLocalTime(time);
	}

	/**
	 * Test of setLocalTime method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSetLocalTime_Date() throws PiwikException, MalformedURLException {
		System.out.println("setLocalTime");
		Date time = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		instance.setLocalTime(time);
	}

	/**
	 * Test of getGeneralQuery method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetGeneralQuery() throws PiwikException, MalformedURLException {
		System.out.println("getGeneralQuery");
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String result = instance.getGeneralQuery();
		Assert.assertEquals(0, this.assertGeneralURLPart(result));
	}

	private int assertGeneralURLPart(final String result) {
		String expResult = "idsite=0&rec=1&apiv=1&_id=" + SimplePiwikTrackerTest.TEST_VISITORID + "&cookie=false&r=";
		String generalpart = result.substring(0, expResult.length());
		String rest = result.substring(generalpart.length());
		int index = rest.indexOf("&");
		if (index == -1) {
			index = rest.length();
		}
		String random = result.substring(generalpart.length(), generalpart.length() + index);
		Assert.assertEquals(expResult, generalpart);
		//        Assert.assertTrue(random.matches("[0-9]\\.[0-9]{" + (index - 2) + "}"));
		Assert.assertTrue(random.matches("[0-9]{6}"));
		Assert.assertEquals(index, random.length());
		return result.length() - generalpart.length() - random.length();
	}

	private void assertFullUrl(final String expEnding, final String expApiurl, final String result) {
		String apiurl = result.substring(0, expApiurl.length());
		Assert.assertEquals(expApiurl, apiurl);
		int restlength = this.assertGeneralURLPart(result.substring(apiurl.length()));
		Assert.assertEquals(expEnding, result.substring(result.length() - restlength));
	}

	/**
	 * Test of getGoalTrackURL method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetGoalTrackURL_String() throws PiwikException, MalformedURLException {
		System.out.println("getGoalTrackURL");
		String goal = "testgoal";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String expResult = "&idgoal=testgoal";
		this.assertFullUrl(expResult, "http://localhost/piwik/piwik.php?", instance.getGoalTrackURL(goal).toString());
	}

	/**
	 * Test of getGoalTrackURL method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetGoalTrackURL_String_String() throws PiwikException, MalformedURLException {
		System.out.println("getGoalTrackURL");
		String goal = "testgoal";
		String revenue = "1";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String expResult = "&idgoal=testgoal&revenue=1";
		this.assertFullUrl(expResult, "http://localhost/piwik/piwik.php?", instance.getGoalTrackURL(goal, revenue).toString());
	}

	/**
	 * Test of getDownloadTrackURL method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetDownloadTrackURL() throws PiwikException, MalformedURLException {
		System.out.println("getDownloadTrackURL");
		String downloadurl = "http://localhost/testdownload.pdf";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String expResult = "&download=http%3A%2F%2Flocalhost%2Ftestdownload.pdf";
		this.assertFullUrl(expResult, "http://localhost/piwik/piwik.php?", instance.getDownloadTrackURL(downloadurl).toString());
	}

	/**
	 * Test of getLinkTrackURL method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetLinkTrackURL() throws PiwikException, MalformedURLException {
		System.out.println("getLinkTrackURL");
		String linkurl = "http://localhost/testlink";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String expResult = "&link=http%3A%2F%2Flocalhost%2Ftestlink";
		this.assertFullUrl(expResult, "http://localhost/piwik/piwik.php?", instance.getLinkTrackURL(linkurl).toString());
	}

	/**
	 * Test of getPageTrackURL method, of class SimplePiwikTracker.
	 */
	@Test
	public void testGetPageTrackURL() throws PiwikException, MalformedURLException {
		System.out.println("getPageTrackURL");
		String pagename = "testpage";
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		String expResult = "&action_name=testpage";
		this.assertFullUrl(expResult, "http://localhost/piwik/piwik.php?", instance.getPageTrackURL(pagename).toString());
	}

	/**
	 * Test of sendRequest method, of class SimplePiwikTracker.
	 */
	@Test
	public void testSendRequest() throws PiwikException, MalformedURLException {
		System.out.println("sendRequest");
		URL destination = null;
		instance.setVisitorId(SimplePiwikTrackerTest.TEST_VISITORID);
		ResponseData expResult = null;
		ResponseData result = instance.sendRequest(destination);
		Assert.assertEquals(expResult, result);
	}
}
