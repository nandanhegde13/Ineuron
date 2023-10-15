package CoreJava.Interfaces;

public class Student {

	private String id;
	private String sname;
	private String saadr;
	
	Branch branch;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaadr() {
		return saadr;
	}

	public void setSaadr(String saadr) {
		this.saadr = saadr;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
