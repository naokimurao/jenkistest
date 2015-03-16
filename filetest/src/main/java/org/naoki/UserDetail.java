package org.naoki;


public class UserDetail {
	
	private String userId;
	private String sid;
	private String ctim;
	private String extension_Partition;
	private String deviceId;
	private String extension;
	private String partition;
	
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getCtim() {
		return ctim;
	}
	
	public void setCtim(String ctim) {
		this.ctim = ctim;
	}
	
	public String getExtension_Partition() {
		return extension_Partition;
	}
	
	public void setExtension_Partition(String extension_Partition) {
		this.extension_Partition = extension_Partition;
		String delimiter = "&";
		String [] temp = this.extension_Partition.split(delimiter);
		
		if(temp.length > 0) {
			String ext = temp[0];
			this.setExtension(ext);
		}
	}
	
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getPartition() {
		return partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	
	@Override
    public String toString() {
        return "User Detail [" +
               "userId= " + this.userId + 
               ", ctim= " + this.ctim +
               ", deviceId= " + this.deviceId +
               ", extension= " + this.extension +
               ", partition= " + this.partition +
                ']';
    }

}
