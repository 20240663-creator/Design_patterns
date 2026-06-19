package behavior_patterns.state_pattern;

public class DirectionService {
    private Service requestedService;

    public DirectionService(Service service){
        this.requestedService = service;
    }

    public void implementService(){
        requestedService.getEta();
    }

    public Service getRequestedService() {
        return requestedService;
    }

    public void setRequestedService(Service requestedService) {
        this.requestedService = requestedService;
    }
}
