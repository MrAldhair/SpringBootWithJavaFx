package PSGV;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class PsgvApplication extends Application {

	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() throws IOException {

		springContext = SpringApplication.run(PsgvApplication.class);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ViewPrincipal.fxml"));
		loader.setControllerFactory(springContext::getBean);
		rootNode = loader.load();

	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setScene(new Scene(rootNode));
		stage.show();

	}

	@Override
	public void stop() {

		springContext.stop();

	}
}
