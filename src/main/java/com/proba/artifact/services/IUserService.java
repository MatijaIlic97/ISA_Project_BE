package com.proba.artifact.services;

import com.proba.artifact.models.UserModel;
import com.proba.artifact.models.UserPageModel;
import com.proba.artifact.models.UserProfileModel;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IUserService {
    UserProfileModel findByProfile(String profile);
    List<UserModel> findAll();
    UserPageModel findPagedList(PageRequest pageRequest);

    UserModel create(UserModel model);

    UserModel update(UserModel model);

    void delete(Integer userId);
}
