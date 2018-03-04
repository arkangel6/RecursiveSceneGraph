import java.util.ArrayList;
import java.util.List;

public class Scene {
	private List<Object> sceneObjects = new ArrayList<Object>();
	
	public void addObject(Object o){
		sceneObjects.add(o);
	}
	
	public void update(){
		updateObject(sceneObjects.size() - 1);
	}
	
	/**	Recursively updates all objects in the scene
	 *  @param object element to start updating from 
	 *  Precondition: -1 <= obj < sceneObjects.size()
	 */
	public void updateObject(int obj){
		/* your code here */
	}
}

class Object {
	private List<Component> attachedComponents = new ArrayList<Component>();
	
	public void addComponent(Component c){
		attachedComponents.add(c);
	}
	
	public void update(){
		updateComponent(attachedComponents.size() - 1);
	}
	
	/**	Recursively updates all components attached to the object
	 *  @param component element to start updating from 
	 *  Precondition: -1 <= com < sceneObjects.size()
	 */
	public void updateComponent(int com){
		/* your code here */
	}
}

class Component {
	private static int count = 0;
	private int id;
	
	private boolean updated = false;
	
	private List<Component> attachedComponents = new ArrayList<Component>();
	
	public void addComponent(Component c){
		attachedComponents.add(c);
	}
	
	public Component(){
		count++;
		id = count;
	}
	
	public int getID(){
		return id;
	}
	
	public void update(){
		updated = true;
		updateSubComponent(attachedComponents.size() - 1);
	}
	
	/**	Recursively updates all sub components attached to the component
	 *  @param sub component element to start updating from 
	 *  Precondition: -1 <= com < sceneObjects.size()
	 */
	public void updateSubComponent(int com){
		/* your code here */
	}
	
	public boolean isUpdated(){
		return updated;
	}
	
	public String toString(){
		return "" + updated;
	}
}