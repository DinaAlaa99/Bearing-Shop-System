/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearingshop;

/**
 *
 * @author Dina Alaa
 */
public class Transactions {

    private String Status;
    private String BillNumber, Name;
    private int D_Year;
    private double TotalPaidAmount;

    public Transactions(String BillNumber, String Status, int D_Year, String Name, double TotalPaidAmount) {
        this.BillNumber = BillNumber;
        this.Status = Status;
        this.Name = Name;
        this.D_Year = D_Year;
        this.TotalPaidAmount = TotalPaidAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBillNumber() {
        return BillNumber;
    }

    public void setBillNumber(String BillNumber) {
        this.BillNumber = BillNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getD_Year() {
        return D_Year;
    }

    public void setD_Year(int D_Year) {
        this.D_Year = D_Year;
    }

    public double getTotalPaidAmount() {
        return TotalPaidAmount;
    }

    public void setTotalPaidAmount(double TotalPaidAmount) {
        this.TotalPaidAmount = TotalPaidAmount;
    }

}
