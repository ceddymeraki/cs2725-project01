package cs2725.LinkedLists;

/**
 * Class to pass as a generic object for the Doubly Linked
   List project.
 */
public class Car implements OpenCloneable<Car>
{
    public static class Manufacturer
    {
        String brand;

        public Manufacturer(String brand)
        {
            this.brand = brand;
        }

        public Manufacturer clone()
        {
            return new Manufacturer(new String(this.brand));
        }

        public boolean equals(Manufacturer x)
        {
            return this.brand.equals(x.brand);
        }

        public String getBrand()
        {
            return this.brand;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public String toString()
        {
            return "{" + brand + "}";
        }
    }

    private Manufacturer make;

    public Car(Manufacturer make)
    {
        this.make = make;
    }

    public Car(String brand)
    {
        this.make = new Manufacturer(brand);
    }

    public Car clone()
    {
        return new Car(new Manufacturer(this.make.getBrand()));
    }

	public boolean equals(Object o) {
        if(o.getClass() == this.getClass()) {
            return this.equals((Car) o);
        }

        else {
            return false;
        }
    }

    public boolean equals(Car x)
    {
        if(this.make.getBrand() == x.make.getBrand())
        {
            return true;
        }

        return false;
    }

    public Manufacturer getMake()
    {
        return this.make;
    }

    public void setMake(Manufacturer make)
    {
        this.make = make;
    }

    public String toString()
    {
        return make.toString();
    }

}
