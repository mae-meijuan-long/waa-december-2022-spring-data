package edu.miu.mae.repository;

import edu.miu.mae.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AddressRepository extends CrudRepository<Address,Integer>{
}
