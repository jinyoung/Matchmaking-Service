<template>

    <v-card outlined>
        <v-card-title>
            SendMessage
        </v-card-title>

        <v-card-text>
            <Number label="ChatRoomId" v-model="value.chatRoomId" :editMode="editMode"/>
            <Number label="SenderId" v-model="value.senderId" :editMode="editMode"/>
            <Number label="ReceiverId" v-model="value.receiverId" :editMode="editMode"/>
            <String label="MessageText" v-model="value.messageText" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="sendMessage"
            >
                SendMessage
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SendMessageCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.chatRoomId = 0;
            this.value.senderId = 0;
            this.value.receiverId = 0;
            this.value.messageText = '';
        },
        watch: {
        },
        methods: {
            sendMessage() {
                this.$emit('sendMessage', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

