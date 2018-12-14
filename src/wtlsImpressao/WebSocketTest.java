package wtlsImpressao;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.websocket.server.WebSocketHandler;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

public class WebSocketTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server server = new Server(8080);

		WebSocketHandler webSocketHandler = new WebSocketHandler() {

			@Override
			public void configure(WebSocketServletFactory factory) {
				// TODO Auto-generated method stub
				factory.register(MyWebSocketHandler.class);
			}
		};

		server.setHandler(webSocketHandler);
		server.start();
		server.join();
	}

}
