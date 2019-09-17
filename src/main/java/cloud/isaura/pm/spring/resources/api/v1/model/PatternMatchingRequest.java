package cloud.isaura.pm.spring.resources.api.v1.model;

public class PatternMatchingRequest {

	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return "PatternMatchingRequest [input=" + input + "]";
	}
	
	
}
