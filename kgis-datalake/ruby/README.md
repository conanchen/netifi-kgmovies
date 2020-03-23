[RubyGems 101: How to use a third-party Gem in your Ruby application](https://medium.com/@gratefulcheddar/rubygems-101-how-to-use-a-third-party-gem-in-your-ruby-application-37249529dbc7)


由于想在Github上面建立自己的博客，于是在网上找了关于jekyll的搭建案例，但是总是在执行gem install jekyll时失败！

看到网上有些人说是网络被墙了，有这种可能性，但是终归还是找到了好的解决办法！淘宝也做了个gem mirror

RubyGems 镜像 - ruby china网
可以通过地址直接访问 https://gems.ruby-china.com/
如何使用？
$ sudo gem sources --remove https://rubygems.org/
$ sudo gem sources -a https://gems.ruby-china.com/
$ gem sources -l
*** CURRENT SOURCES ***

https://gems.ruby-china.com/
# 请确保只有 https://gems.ruby-china.com/

$ sudo gem install bundler
Successfully installed bundler-2.1.4
Parsing documentation for bundler-2.1.4
Done installing documentation for bundler after 5 seconds
1 gem installed

$ gem install rails
如果你是用 Bundle (Rails 项目) 的Gemfile
source 'https://gems.ruby-china.com/'
gem 'rails', '4.1.0'
...
相同的是装jekyll同样适用！祝你成功，有问题可以留言，共同讨论


```
$ bundle add colorize
```
> Fetching gem metadata from https://rubygems.org/.............
> Resolving dependencies...
> Fetching gem metadata from https://rubygems.org/.............
> Resolving dependencies...
> Using bundler 1.16.2
> Using colorize 0.8.1

```
$ bundle install
```
> Fetching gem metadata from https://rubygems.org/.............
> Using bundler 1.16.2
> Fetching colorize 0.8.1
> Installing colorize 0.8.1
> Bundle complete! 1 Gemfile dependency, 2 gems now installed.
> Use `bundle info [gemname]` to see where a bundled gem is installed.


```bash
../gradlew :kgis-datalake:downloadApolloSchema -Pcom.apollographql.apollo.endpoint=http://localhost:8080/graphql -Pcom.apollographql.apollo.schema=ruby/kgis-dgschema.json
```
也可以直接用intellij Gradle任务Tasks/apollo/downloadApolloSchema进行

```
$ ruby kgis_client_gen.rb
```