package Filesystem;

public class Storage implements Filesystem{

	Filesystem fs = new Filesystem();

	public int store(String filename, String content){

		if (fs.position(filename) > 0) {
			fs.remove(filename);
			fs.touch(filename);
			fs.write(fs.position(filename),content.getBytes());	
		}else{
			fs.touch(filename);	
			fs.write(fs.position(filename),content.getBytes());
		}

	}
	
}