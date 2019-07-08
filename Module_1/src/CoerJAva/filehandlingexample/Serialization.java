package filehandlingexample;
import java.io.*;

class  ObjectIOStream implements Serializable{
	transient private int id;
	private String name;
	private int gid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	
}

public class Serialization{
	public static void main(String[] args) throws Exception {
		ObjectIOStream oios = new ObjectIOStream();
		oios.setId(1209);
		oios.setName("Shubham");
		oios.setGid(1093);
		
		//Writing the data
		FileOutputStream fos = new FileOutputStream("ObjectStream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oios);
		System.out.println("Successfully Done!");
		
		//Reading the data
		FileInputStream fis=new FileInputStream("ObjectStream.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ObjectIOStream o1 = (ObjectIOStream) ois.readObject();
		
		//printing the data
		System.out.println("ID : "+o1.getId());
		System.out.println("Name : "+o1.getName());
		System.out.println("Global ID : "+o1.getGid());
		
		
	}
}
