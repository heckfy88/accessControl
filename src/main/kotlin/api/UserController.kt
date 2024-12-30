package api

import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService
import mu.KotlinLogging
import service.UserService
import sf.*

@GrpcService
class UserController(private val userService: UserService) : UserServiceGrpc.UserServiceImplBase() {

    companion object {
        private val logger = KotlinLogging.logger {}
    }

    override fun createUser(request: CreateUserRequest?, responseObserver: StreamObserver<UserResponse>?) {
        logger.info { "Received /createUser request: ${request.toString()}" }

        val response = userService.createUser(request)

        logger.info { "Response: $response" }

        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }

    override fun getUser(request: GetUserRequest?, responseObserver: StreamObserver<UserResponse>?) {
        logger.info { "Received /getUser request: ${request.toString()}" }

        val response = userService.getUser(request)

        logger.info { "Response: $response" }

        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }


    override fun changeUser(request: ChangeUserRequest?, responseObserver: StreamObserver<UserResponse>?) {
        logger.info { "Received /changeUser request: ${request.toString()}" }

        val response = userService.changeUser(request)

        logger.info { "Response: $response" }

        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }


    override fun deleteUser(request: DeleteUserRequest?, responseObserver: StreamObserver<UserResponse>?) {
        logger.info { "Received /deleteUser request: ${request.toString()}" }

        val response = userService.deleteUser(request)

        logger.info { "Response: $response" }

        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }
}
