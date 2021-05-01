package anotherTypeOfEmployee;

public class Comission extends Hourly {
	double totalSales;
	double commissionRate;

    public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionRate) {
    	super(eName, eAddress, ePhone, socSecNumber, rate);
    	this.commissionRate=commissionRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales=totalSales;
    }
    
    public double pay(){
        double payment = super.pay()+commissionRate*totalSales;
        totalSales = 0;
        return payment;
    }
    

    public String toString() {
        return super.toString()+"\nTotal Sales : "+totalSales;
    }
}