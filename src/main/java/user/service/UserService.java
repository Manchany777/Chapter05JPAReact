package user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//import org.mybatis.spring.annotation.MapperScan;

import user.bean.UserDTO;

public interface UserService {

	public String isExistId(String id);

	public void write(UserDTO userDTO);
	
	public Page<UserDTO> getUserList(Pageable pageable);
	
	public Optional<UserDTO> getUser(String id);
	
	public void update(UserDTO userDTO);
	
	public void delete(String id);

	public Page<UserDTO> getUserSearchList(String columnName, String keyword, Pageable pageable);
}
