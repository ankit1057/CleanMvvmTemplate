package com.greylabsdev.tamplatecleanmvvm.data.repository

import com.greylabsdev.tamplatecleanmvvm.domain.repository.IRepository
import javax.sql.DataSource

class RepositoryImpl(private val localDataSource: DataSource,
                     private val remoteDataSource: DataSource): IRepository {

}