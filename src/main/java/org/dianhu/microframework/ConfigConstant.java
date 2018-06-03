package org.dianhu.microframework;

/**
 * 提供相关配置项常量
 *
 * @author huangyong
 * @since 1.0.0
 */
public interface ConfigConstant {

    String CONFIG_FILE = "micro.properties";

    String JDBC_DRIVER = "micro.framework.jdbc.driver";
    String JDBC_URL = "micro.framework.jdbc.url";
    String JDBC_USERNAME = "micro.framework.jdbc.username";
    String JDBC_PASSWORD = "micro.framework.jdbc.password";

    String APP_BASE_PACKAGE = "micro.framework.app.base_package";
    String APP_JSP_PATH = "micro.framework.app.jsp_path";
    String APP_ASSET_PATH = "micro.framework.app.asset_path";
    String APP_UPLOAD_LIMIT = "micro.framework.app.upload_limit";
}
