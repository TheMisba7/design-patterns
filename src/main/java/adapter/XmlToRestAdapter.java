package adapter;

import java.util.List;

public class XmlToRestAdapter implements IRestWeatherService {
    private final ISoapWeatherService soapWeatherService;

    public XmlToRestAdapter(ISoapWeatherService soapWeatherService) {
        this.soapWeatherService = soapWeatherService;
    }

    @Override
    public List<RestData> getData() {
        List<XmlData> xmlData = soapWeatherService.getData();
        //todo convert xml data to json and return result
        return null;
    }
}
