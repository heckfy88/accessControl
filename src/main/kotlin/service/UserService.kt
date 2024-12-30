package service

import jakarta.inject.Singleton
import sf.*
import java.util.*

@Singleton
class UserService {

    fun createUser(request: CreateUserRequest?): UserResponse {
        val a = UserResponse.newBuilder()
            .setUserId(UUID.randomUUID().toString())
            .setName(request!!.name)
            .setEmail(request.email)
            .setAge(request.age)
            .build()
        return a
    }

    fun getUser(request: GetUserRequest?): UserResponse {
        return UserResponse.newBuilder()
            .setUserId(request!!.userId)
            .setName("Zhigan Limon")
            .setEmail("zhigan-limon@gmail.com")
            .setAge(44)
            .build()
    }

    fun changeUser(request: ChangeUserRequest?): UserResponse {
        return UserResponse.newBuilder()
            .setUserId(UUID.randomUUID().toString())
            .setName(request!!.name)
            .setEmail(request.email)
            .setAge(request.age)
            .build()
    }

    fun deleteUser(request: DeleteUserRequest?): UserResponse {
        return UserResponse.newBuilder()
            .setUserId(request!!.userId)
            .build()
    }
}
