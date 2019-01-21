<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	downloading...




	<%!/**
							 * 获取操作系统,浏览器及浏览器版本信息
							 * @param request
							 * @return
							 */
	public static String getOsAndBrowserInfo(HttpServletRequest request) {
		String browserDetails = request.getHeader("User-Agent");
		String userAgent = browserDetails;
		String user = userAgent.toLowerCase();

		String os = "";
		String browser = "";

		//=================OS Info=======================
		if (userAgent.toLowerCase().indexOf("windows") >= 0) {
			os += "Windows";
		}
		if (userAgent.toLowerCase().indexOf("micromessenger") >= 0) {
			os += "weixin";
		}
		if (userAgent.toLowerCase().indexOf("mac") >= 0) {
			os += "Mac";
		}
		if (userAgent.toLowerCase().indexOf("x11") >= 0) {
			os += "Unix";
		}
		if (userAgent.toLowerCase().indexOf("android") >= 0) {
			os += "Android";
		}
		if (userAgent.toLowerCase().indexOf("iphone") >= 0) {
			os += "IPhone";
		}
		{
			os += "UnKnown, More-Info: " + userAgent;
		}
		//===============Browser===========================
		if (user.contains("edge")) {
			browser = (userAgent.substring(userAgent.indexOf("Edge")).split(" ")[0]).replace("/", "-");
		} else if (user.contains("msie")) {
			String substring = userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
			browser = substring.split(" ")[0].replace("MSIE", "IE") + "-" + substring.split(" ")[1];
		} else if (user.contains("safari") && user.contains("version")) {
			browser = (userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0] + "-"
					+ (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
		} else if (user.contains("opr") || user.contains("opera")) {
			if (user.contains("opera")) {
				browser = (userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0] + "-"
						+ (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
			} else if (user.contains("opr")) {
				browser = ((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-"))
						.replace("OPR", "Opera");
			}

		} else if (user.contains("chrome")) {
			browser = (userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
		} else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1)
				|| (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1)
				|| (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1)) {
			browser = "Netscape-?";

		} else if (user.contains("firefox")) {
			browser = (userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
		} else if (user.contains("rv")) {
			String IEVersion = (userAgent.substring(userAgent.indexOf("rv")).split(" ")[0]).replace("rv:", "-");
			browser = "IE" + IEVersion.substring(0, IEVersion.length() - 1);
		} else {
			browser = "UnKnown, More-Info: " + userAgent;
		}

		return os + " --- " + browser;
	}%>


	<%
		String system = getOsAndBrowserInfo(request).toLowerCase();
		System.out.println(system);
		if (system.indexOf("weixin") >= 0 && system.indexOf("android") >= 0) {
			request.getRequestDispatcher("getcode_weixin.jsp").include(request, response);
			//response.sendRedirect("http://192.168.2.119:9090/icarweb/getcode_weixin.jsp");
		}
		else if (system.indexOf("mac") >= 0 || system.indexOf("ios") >= 0) {
			response.sendRedirect(
					"https://itunes.apple.com/cn/app/%E4%B8%9C%E5%AD%A6%E4%B8%8A%E9%97%A8%E6%B4%97%E8%BD%A6/id1410684554?mt=8");
		} else if (system.indexOf("android") >= 0) {
			//session.setAttribute("download_filename", "d:/kehu.apk");
			//response.sendRedirect("http://192.168.2.119:9090/icarweb/FileUpLoadController/download.action");
			response.sendRedirect("http://www.dxxiche.com:6789/kehu.apk");
		}
	%>











</body>
</html>