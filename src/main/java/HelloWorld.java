import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Khi ban thay dong nay co nghia la jenkins da deploy tu dong r. Good job!!! Chuc mung em @@@@@");
	}
}
