package Day_6.General;

public class employee {
    public double basic;
    protected long empid;
    private String ename;
    public employee(double ba, long id, String name) {
        basic = ba;
        empid = id;
        ename = name;
    }
    public double earning() { // Note: your image says 'earning', not 'earnings'
        double earn = basic + 0.8 * basic + 0.15 * basic;
        return earn;
    }
}