package it.musichub.rest.model;

public class HealthDto {
	
	private String version;
	private String status;
	private DeviceDto selectedDevice;
	
	public HealthDto(String version, String status, DeviceDto selectedDevice) {
		super();
		this.version = version;
		this.status = status;
		this.selectedDevice = selectedDevice;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public DeviceDto getSelectedDevice() {
		return selectedDevice;
	}

	public void setSelectedDevice(DeviceDto selectedDevice) {
		this.selectedDevice = selectedDevice;
	}

}
