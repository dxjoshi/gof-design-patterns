public class Runner {

    public static void main(String[] args) {
        givenOAuthProvider_whenCheckingAuthorized_thenSuccess();
        givenSamlProvider_whenCheckingAuthorized_thenSuccess();
    }

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }

    public static void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        System.out.println(String.format("Result: %s", authProcessorChain.isAuthorized(new OAuthTokenProvider())));
    }

    public static void givenSamlProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        System.out.println(String.format("Result: %s", authProcessorChain.isAuthorized(new SamlTokenProvider())));
    }
}
