PSApp
=====

A tool for students. Original idea: [GradeTool](https://github.com/benwaffle/GradeTool).

Ideas:
  - plugin system ???
  - task management
  - SMS notifications via Twilio
  - PowerSchool integration with [PSLib](https://github.com/benwaffle/PSLib).

An important decision to make is whether to have plugins. Originally, this was designed to be complementary to PowerSchool and thus require a student's school to use it. With a plugin system, the program is much more flexible which would allow many additions. For example, students with a programming course could enable the REPL or compiler plugin, to allow for seamless notetaking and programming simultaneously. The downside, of course, is that would be quite some work and would have to be designed correctly so that a plugin system would integrate well with other components.
