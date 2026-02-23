package ex0211.sample02;

class Employee{
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hiredate;
	private String deptName;
	
	Employee(){
		
	}
	
	Employee(int empNo, String eName, String job, int mgr, String hiredate, String deptName){
		this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.deptName = deptName;
	}
	
	public void message(){
		System.out.println("Employee.message()가 호출되었습니다.");
		
	}
	
	@Override
	public String toString() {
		
		return empNo + " | " + eName + " | " + job + " | " + mgr + " | " 
				+ hiredate + " | " + deptName;
		
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}

class FullTime extends Employee{
	private int salary;
	private int bonus;
	
	FullTime(){
		
	}
	
	FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, 
			 int salary, int bonus){
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void message(){
		System.out.println(geteName() + "사원은 정규직입니다.");
		
	}
	
	@Override
	public String toString() {
		
		//return empNo + " | " + eName + " | " + job + " | " + mgr + " | "
				//+ " | " + hiredate + " | " + deptName + " | " + salary + " | " + bonus;
		return super.toString() + " | " + salary + " | " + bonus;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}

class PartTime extends Employee{
	private int timePay;
	
	PartTime(){
		
	}
	
	PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, 
			 int timePay){
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}
		
		
	
	public void message(){
		System.out.println(geteName() + "사원은 비정규직입니다.");
		
	}
	
	@Override
	public String toString() {
		
		//return empNo + " | " + eName + " | " + job + " | " + mgr + " | "
				//+ " | " + hiredate + " | " + deptName + " | " + salary + " | " + bonus;
		return super.toString() + " | " + timePay;
		
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	
}




public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee emp [] = new Employee[5];
		
		emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		emp[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		emp[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		emp[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		emp[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		
		System.out.println("************************** Emp 정보 **************************");
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("********************** Emp Message 정보 **********************");
		for(Employee e : emp) {
			e.message();
		}
		
	}

}