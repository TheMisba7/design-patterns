package adapter;

public class RestClient {
    public static void main(String[] args) {
        IRestWeatherService restWeatherService = new XmlToRestAdapter(new SoapWeatherServiceImpl());
        restWeatherService.getData();
    }
}
