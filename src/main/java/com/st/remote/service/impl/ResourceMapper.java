package com.st.remote.service.impl;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

/**
 * Extending Dozer bean for using it in the application.
 * 
 * @author sergio.torres.lozano
 *
 */
@Service
public class ResourceMapper extends DozerBeanMapper {

	public ResourceMapper() {
		super();
	}
}
