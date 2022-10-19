package assignments3.java;

public class Automation extends MultipleLanguage  implements TestTool,Language {
public static void main(String[] args) {
	Automation auto = new Automation();
	auto.Python();
	auto.Java();
	auto.javaScript();
	auto.ruby();
	auto.Selenium();
}
	
public void Python() {
	System.out.println("Python");
}
	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void javaScript() {
		// TODO Auto-generated method stub
		System.out.println("Javascript");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

}
