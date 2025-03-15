# Ansible Project Documentation

## Overview
This project contains an Ansible playbook designed to patch the IPA client installed on RHEL 8 servers. The playbook automates the process of checking the current version of the IPA client, applying necessary updates, and ensuring that the service is restarted if required.

## Project Structure
```
ansible-project
├── playbooks
│   └── patch_ipa_client.yml
├── inventory
│   └── hosts
└── README.md
```

## Files Description
- **playbooks/patch_ipa_client.yml**: Contains the Ansible playbook with tasks to patch the IPA client.
- **inventory/hosts**: Specifies the inventory of RHEL 8 servers with the IPA client installed.

## Prerequisites
- Ansible installed on the control node.
- Access to the RHEL 8 servers with the IPA client installed.
- Proper SSH access and permissions to execute the playbook on the target servers.

## Running the Playbook
1. Navigate to the project directory:
   ```
   cd /path/to/ansible-project
   ```

2. Execute the playbook using the following command:
   ```
   ansible-playbook -i inventory/hosts playbooks/patch_ipa_client.yml
   ```

## Configuration
Ensure that the `inventory/hosts` file is correctly configured with the IP addresses or hostnames of the RHEL 8 servers where the IPA client is installed.

## Notes
- Review the playbook for any specific configurations or variables that may need to be adjusted based on your environment.
- Monitor the output of the playbook execution for any errors or required manual interventions.