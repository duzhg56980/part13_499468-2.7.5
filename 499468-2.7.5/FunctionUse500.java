import org.apache.dubbo.config.DubboShutdownHook;
public class FunctionUse500 {
public void funcUse() {
DubboShutdownHook dubboshutdownhook = new DubboShutdownHook();
dubboshutdownhook.register();
}
}