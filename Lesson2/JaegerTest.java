public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        jaeger.setName("PumaReal");
        jaeger.setModel("Mark-2");
        jaeger.setLaunch(2016);
        jaeger.setOrigin("Panama");
        jaeger.setPattern("Panamian Jaeger");
        jaeger.setPlacement("Panama City Shatterdome");
        jaeger.setJaegSpecifications("Jaeger");
        jaeger.setCombSpecifications("Out-of-Universe information");
        jaeger.setStatus("Destroyed");
        System.out.println("Name - " + jaeger.getName());
        System.out.println("Model - " + jaeger.getModel());
        System.out.println("Launch - " + jaeger.getLaunch());
        System.out.println("Origin - " + jaeger.getOrigin());
        System.out.println("Pattern - " + jaeger.getPattern());
        System.out.println("Placement - " + jaeger.getPlacement());
        System.out.println("JaegSpecification - " + jaeger.getJaegSpecifications());
        System.out.println("CombSpecifications - " + jaeger.getCombSpecifications());
        System.out.println("Status - " + jaeger.getStatus());
        System.out.println("");

        jaeger.setName("Coyote Tango");
        jaeger.setModel("Mark-1");
        jaeger.setLaunch(2015);
        jaeger.setOrigin("Japan");
        jaeger.setPattern("It was one of the oldest Jaegers");
        jaeger.setPlacement("Tokyo, Japan");
        jaeger.setJaegSpecifications("Jaeger");
        jaeger.setCombSpecifications("Out-of-Universe information");
        jaeger.setStatus("Destroyed");
        System.out.println("Name - " + jaeger.getName());
        System.out.println("Model - " + jaeger.getModel());
        System.out.println("Launch - " + jaeger.getLaunch());
        System.out.println("Origin - " + jaeger.getOrigin());
        System.out.println("Pattern - " + jaeger.getPattern());
        System.out.println("Placement - " + jaeger.getPlacement());
        System.out.println("JaegSpecification - " + jaeger.getJaegSpecifications());
        System.out.println("CombSpecifications - " + jaeger.getCombSpecifications());
        System.out.println("Status - " + jaeger.getStatus());
    }
}
