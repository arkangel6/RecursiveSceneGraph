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
		/*for(int i = 0; i < obj; i++) {
			sceneObjects.get(i).update();
		}*/
		/*if(obj == 0) {
			sceneObjects.get(0).update();
		}
		else {
			sceneObjects.get(obj).update();
			this.updateObject(--obj);
		
		}*/
		if(obj >= 0) {
			update();
			updateObject(obj-1);
		}
		
		
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
		/*if(com == 0) {
			attachedComponents.get(0).update();
		}
		else {
			attachedComponents.get(com).update();
			this.updateComponent(--com);
		
		}*/
		/*for(int i = 0; i < com; i++) {
			attachedComponents.get(i).update();
		}*/
		if(com >= 0) {
			update();
			updateComponent(com-1);
		}
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
		
		/*if(com == 0) {
			attachedComponents.get(0).update();
		}
		else {
			attachedComponents.get(com).update();
			this.updateSubComponent(--com);
		}*/
		
		if(com >= 0) {
			update();
			updateSubComponent(com-1);
		}
		
	}
	
	public boolean isUpdated(){
		return updated;
	}
	
	public String toString(){
		return "" + updated;
	}
}
