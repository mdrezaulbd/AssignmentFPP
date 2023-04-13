package assignment5.problem5;

public class Computer {
   private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

   public double computePower()
    {
       return (double) this.ramSize*this.processorSpeed;
    }

    @Override
    public String toString() {
        return   "Manufacturer:" + manufacturer + " " +
                ", Processor:" + processor + " " +
                ", Ram Size:" + ramSize + " "+
                ", Processor Speed:" + processorSpeed ;

    }

    @Override
    public  boolean equals(Object obj)
    {
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Computer c=(Computer) obj;
        return  getRamSize()==this.getRamSize() && getProcessorSpeed()==this.processorSpeed
                && manufacturer.equals(c.manufacturer) && processor.equals(c.processor);



    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + ramSize;
        long temp = Double.doubleToLongBits(processorSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
