package com.company;

public class Company {
    private String CompanyName;
    private int CompanyId;
    public void setCompanyName(String n){
        this.CompanyName=n;
    }
    public String getCompanyName(){
        return CompanyName;
    }
    public void setCompanyId(int k){
        this.CompanyId=k;
    }
    public int getCompanyId(){
        return CompanyId;
    }
    public static void main(String[] args) {
        Company sc=new Company();
        sc.setCompanyName("Mihir Enterprise");
        String CompanyName=sc.getCompanyName();
        sc.setCompanyId(12512516);
        int CompanyId=sc.getCompanyId();

        System.out.println("My company name:-" + CompanyName);
        System.out.println("Company id:-" +CompanyId);

    }

}
