import static org.junit.Assert.*;

import org.junit.Test;

public class SceneGraphTest {

	@Test
	public void testSceneGraph() {
		Scene scene = new Scene();
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		Object o4 = new Object();
		Object o5 = new Object();
		
		Component o1c1 = new Component();
		Component o1c2 = new Component();
		Component o1c3 = new Component();
		Component o2c1 = new Component();
		Component o2c2 = new Component();
		Component o2c3 = new Component();
		Component o2c4 = new Component();
		Component o2c5 = new Component();
		Component o3c1 = new Component();
		Component o3c2 = new Component();
		Component o4c1 = new Component();
		Component o4c2 = new Component();
		Component o4c3 = new Component();
		Component o4c4 = new Component();
		Component o5c1 = new Component();
		
		o1.addComponent(o1c1);
		o1.addComponent(o1c2);
		o1c2.addComponent(o1c3);
		o2.addComponent(o2c1);
		o2c1.addComponent(o2c2);
		o2c1.addComponent(o2c3);
		o2.addComponent(o2c4);
		o2.addComponent(o2c5);
		o3.addComponent(o3c1);
		o3c1.addComponent(o3c2);
		o4.addComponent(o4c1);
		o4.addComponent(o4c2);
		o4c2.addComponent(o4c3);
		o4c2.addComponent(o4c4);
		o5.addComponent(o5c1);
		
		scene.addObject(o1);
		scene.addObject(o2);
		scene.addObject(o3);
		scene.addObject(o4);
		scene.addObject(o5);
		
		scene.update();
		
		assertTrue(o1c1.isUpdated());
		assertTrue(o1c2.isUpdated());
		assertTrue(o1c3.isUpdated());
		assertTrue(o2c1.isUpdated());
		assertTrue(o2c2.isUpdated());
		assertTrue(o2c3.isUpdated());
		assertTrue(o2c4.isUpdated());
		assertTrue(o2c5.isUpdated());
		assertTrue(o3c1.isUpdated());
		assertTrue(o3c2.isUpdated());
		assertTrue(o4c1.isUpdated());
		assertTrue(o4c2.isUpdated());
		assertTrue(o4c3.isUpdated());
		assertTrue(o4c4.isUpdated());
		assertTrue(o5c1.isUpdated());
	}
}