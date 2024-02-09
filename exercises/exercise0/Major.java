public class Major {
    String MajorCode;
    String MajorName;
    String DegreeType;
    int CreditRequirements;
    String Description;
    String Specialization;
    boolean FinanceAid;
    boolean InternshipOpportunities;

    public Major(String mc, String mn, String dt, int cr, String dcr ,String sl, boolean fa, boolean io){
        MajorCode = mc;
        MajorName = mn;
        DegreeType = dt;
        CreditRequirements = cr;
        Description = dcr;
        Specialization = sl;
        FinanceAid = fa;
        InternshipOpportunities = io;
        System.out.println("The major code of " + mn+" is " + mc +".");
    }

    public String getMajorCode() {
        return MajorCode;
    }

    public String getMajorName() {
        return MajorName;
    }

    public int getCreditRequirements() {
        return CreditRequirements;
    }


}
