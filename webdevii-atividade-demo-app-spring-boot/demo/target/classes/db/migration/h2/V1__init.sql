create table users (
  id bigint generated always as identity primary key,
  username varchar(120) unique not null,
  created_at timestamp default current_timestamp not null,
  updated_at timestamp default current_timestamp not null
);
