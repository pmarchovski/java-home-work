
public class Fields {

	private String  fieldsName;
	private boolean isFieldsActive = true;
	private int     type;
	
	public Fields(String fieldsName) {

		this.fieldsName = fieldsName;
	}
	
	public String getFieldsName() {
		return fieldsName;
	}
	public void setFieldsName(String fieldsName) {
		this.fieldsName = fieldsName;
	}
	
	public void displayFields() {
		System.out.print(" " + this.fieldsName);

	}

	public boolean isFieldsActive() {
		return isFieldsActive;
	}

	public void setFieldsActive(boolean fieldsActive) {
		this.isFieldsActive = fieldsActive;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
