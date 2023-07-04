package com.springbootlearning.learningspringboot3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CoreDomainTest {

	@Test
	void newVideoEntityShouldHaveNullId() {

		VideoEntity entity = new VideoEntity("alice", "title", "description");

		assertThat(entity.getId()).isNull();
		assertThat(entity.getUsername()).isEqualTo("alice");
		assertThat(entity.getName()).isEqualTo("title");
		assertThat(entity.getDescription()).isEqualTo("description");
	}

	@Test
	void toStringShouldAlsoBeTested() {

		VideoEntity entity = new VideoEntity("alice", "title", "description");

		assertThat(entity.toString())
				.isEqualTo("VideoEntity{" + "id=null, username='alice', name='title', description='description'}");
	}

	@Test
	void settersShouldMutateState() {

		VideoEntity entity = new VideoEntity("alice", "title", "description");

		entity.setId(99L);
		entity.setName("new title");
		entity.setDescription("new description");
		entity.setUsername("bob");

		assertThat(entity.getId()).isEqualTo(99L);
		assertThat(entity.getUsername()).isEqualTo("bob");
		assertThat(entity.getName()).isEqualTo("new title");
		assertThat(entity.getDescription()).isEqualTo("new description");

	}

	@Test
	void noArgsContructorShouldBeTested() {

		VideoEntity entity = new VideoEntity();

		entity.setId(99L);
		entity.setDescription("description");
		entity.setName("title");
		entity.setUsername("mario");

		assertThat(entity.getId()).isEqualTo(99L);
		assertThat(entity.getDescription()).isEqualTo("description");

	}
}
