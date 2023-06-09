package Storage;
pulic class NotePadminusminus{

	/* ... */

	public void save() {
		String content = DocBuffer.getContent();
		String name = DocManager.getCurrentFileName();

		Storage.store(name, content);
	}
}