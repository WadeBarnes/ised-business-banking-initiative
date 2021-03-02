    
package bc;

class baseConfig {
  // Wait timeout in minutes
  public static final int WAIT_TIMEOUT = 10

  // Deployment Environment TAGs
  public static final String[] DEPLOYMENT_ENVIRONMENT_TAGS = ['dev', 'test', 'prod']

  // The name of the project namespace(s).
  public static final String  NAME_SPACE = 'a99fd4'

  // Instance Suffix
  public static final String  SUFFIX = ''

  // Apps - Listed in the order they should be built
  public static final String[] APPS = ['issuer-kit-db', 'issuer-kit-wallet', 'visual-verifier', 'issuer-kit-web', 'issuer-kit-agent', 'issuer-kit-api']

  // Apps - Listed in the order they should be tagged for deployment
  public static final String[] DEPLOY_APPS = ['issuer-kit-db', 'issuer-kit-wallet', 'visual-verifier', 'issuer-kit-web', 'issuer-kit-agent', 'issuer-kit-api']
}