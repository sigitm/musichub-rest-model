package it.musichub.rest.model;

import java.util.List;

import it.musichub.rest.model.utils.PaginatedList;
import it.musichub.rest.model.utils.PagingLinks;

public class DeviceDtoList extends PaginatedList<DeviceDto> {

	public DeviceDtoList(int total, List<DeviceDto> results, PagingLinks _links) {
		super(total, results, _links);
	}

}
