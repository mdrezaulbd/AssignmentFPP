package assignment8.prob3;

public class Marketing {

  private  String employeename;
  private String  productname;
  private  double     salesamount;

  public Marketing(String mployeename, String productname, double salesamount) {
    this.employeename = mployeename;
    this.productname = productname;
    this.salesamount = salesamount;
  }

  public String getEmployeename() {
    return employeename;
  }

  public void setEmployeename(String employeename) {
    this.employeename = employeename;
  }

  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }

  public double getSalesamount() {
    return salesamount;
  }

  public void setSalesamount(double salesamount) {
    this.salesamount = salesamount;
  }

  @Override
  public  String toString()
  {
    return "Employee Name:"+ getEmployeename()+",Product Name:"+getProductname()+",Sales amount :"+getSalesamount()+"\n";
  }

  @Override
  public boolean equals(Object obj)
  {
    if(obj==null) return false;
    if(obj.getClass()!=this.getClass()) return  false;
    Marketing m= (Marketing) obj;
    return  this.salesamount==m.salesamount &&
            this.employeename.equals(m.employeename) && this.productname.equals(m.productname) ;

  }



}
