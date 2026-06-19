package behavior_patterns.state_pattern;


public class StateMain {
    public static void main(String[] args){
        DirectionService directionService = new DirectionService(new Walking());

        directionService.implementService();

        directionService.setRequestedService(new Bicycling());

        directionService.implementService();
    }
}
