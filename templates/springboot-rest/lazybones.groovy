def props = [:]
props.group = ask('group [ru.stereohorse]', 'ru.stereohorse', 'group')
props.version = ask('version [0.1]', '0.1', 'version')

processTemplates 'build.gradle', props
