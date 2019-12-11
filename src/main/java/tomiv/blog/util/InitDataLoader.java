package tomiv.blog.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tomiv.blog.model.User;
import tomiv.blog.repository.UserRepository;


@Component
@Transactional
public class InitDataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        User user1 = new User();
        user1.setEmail("feri@mail.com");
        user1.setUsername("Feri");
        user1.setPassword("go");

        userRepository.save(user1);

         */
    }
}
