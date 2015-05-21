package com.agileasoft.zebra.examples.javaonly;

import java.util.ArrayList;
import java.util.List;

import com.agileasoft.zebra.Mapper;
import com.agileasoft.zebra.MapperFactory;
import com.agileasoft.zebra.MapperProcessor;
import com.agileasoft.zebra.examples.javaonly.mapper.RoleDtoEntityMapper;
import com.agileasoft.zebra.examples.javaonly.mapper.UserDtoEntityMapper;

public class MapperFactorySingleton {

	private static MapperFactorySingleton instance;

	private final MapperProcessor mapper;

	// private constructor
	private MapperFactorySingleton() {

		final MapperFactory factory = new MapperFactory();
		this.mapper = factory.registerAll(this.listMappers()).build();
	}

	public static MapperFactorySingleton getInstance() {

		if (MapperFactorySingleton.instance == null) {
			MapperFactorySingleton.instance = new MapperFactorySingleton();
		}

		return MapperFactorySingleton.instance;
	}

	public MapperProcessor getMapper() {

		return this.mapper;
	}

	@SuppressWarnings("rawtypes")
	private List<Mapper> listMappers() {

		final List<Mapper> listMappers = new ArrayList<>();

		// register manually your mappers here.
		listMappers.add(new UserDtoEntityMapper());
		listMappers.add(new RoleDtoEntityMapper());
		// ... add other mappers here.
		return listMappers;
	}
}
