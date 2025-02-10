
package Subject;

public abstract class Observer {
   protected Subject subject;
   boolean isActive= true;
   public abstract void update();
}