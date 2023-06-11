public interface IStorage{
	public void store(String name, byte[] data);
	}


public class NotepadMinusMinus {
	IStorage Storage;
	publicic void setStorage(IStorage s) {
	 Storage = s;
}

public void save() {
	String content = DocBuffer.getContent();
	String name = DocManager.getCurrentFileName();
	Storage.store(name, content)
	} 
}

public class DropBoxStorage implements IStorage {
	public void store(String filename, byte[] content){
		if(DbxClient.fileExists(filename)){
			uploadFile(filename, DbxClient.WriteMode.REPLACE, content);
		}
		else{
			uploadFile(filename, DbxClient.WriteMode.ADD, content);
		}
	} 
}

public class Storage implements IStorage {
	public void store(String filename, byte[] content){
	int fd = Filesystem.position(filename);
	if(fd == -1){
		Filesystem.touch(filename);
		fd = Filesystem.position(filename);
	}else{
		Filesystem.remove(filename);
		Filesystem.touch(filename); 
		}
		Filesystem.write(fd, content); 
	}
}

